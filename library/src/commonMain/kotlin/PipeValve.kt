package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PipeValve: ImageVector
    get() {
        if (_PipeValve != null) {
            return _PipeValve!!
        }
        _PipeValve = ImageVector.Builder(
            name = "PipeValve",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                horizontalLineTo(16.58f)
                curveTo(15.81f, 20.76f, 14.05f, 22f, 12f, 22f)
                reflectiveCurveTo(8.19f, 20.76f, 7.42f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(7.43f)
                curveTo(7.93f, 13.85f, 8.85f, 12.93f, 10f, 12.42f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(12.42f)
                curveTo(15.15f, 12.93f, 16.07f, 13.85f, 16.57f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                moveTo(17f, 2f)
                horizontalLineTo(7f)
                curveTo(6.45f, 2f, 6f, 2.45f, 6f, 3f)
                reflectiveCurveTo(6.45f, 4f, 7f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                curveTo(17.55f, 4f, 18f, 3.55f, 18f, 3f)
                reflectiveCurveTo(17.55f, 2f, 17f, 2f)
                close()
            }
        }.build()

        return _PipeValve!!
    }

@Suppress("ObjectPropertyName")
private var _PipeValve: ImageVector? = null
