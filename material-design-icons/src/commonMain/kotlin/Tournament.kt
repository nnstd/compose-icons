package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Tournament: ImageVector
    get() {
        if (_Tournament != null) {
            return _Tournament!!
        }
        _Tournament = ImageVector.Builder(
            name = "Tournament",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                curveTo(8.11f, 10f, 9f, 9.11f, 9f, 8f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                curveTo(9f, 14.89f, 8.11f, 14f, 7f, 14f)
                horizontalLineTo(2f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                curveTo(8.11f, 22f, 9f, 21.11f, 9f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                curveTo(15.11f, 19f, 16f, 18.11f, 16f, 17f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                curveTo(16f, 5.89f, 15.11f, 5f, 14f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                curveTo(9f, 2.89f, 8.11f, 2f, 7f, 2f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _Tournament!!
    }

@Suppress("ObjectPropertyName")
private var _Tournament: ImageVector? = null
