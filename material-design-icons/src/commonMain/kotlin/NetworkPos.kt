package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NetworkPos: ImageVector
    get() {
        if (_NetworkPos != null) {
            return _NetworkPos!!
        }
        _NetworkPos = ImageVector.Builder(
            name = "NetworkPos",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                moveTo(7f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                moveTo(7f, 4f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                moveTo(10f, 4f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                moveTo(13f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                curveTo(14.55f, 19f, 15f, 19.45f, 15f, 20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                curveTo(15f, 22.55f, 14.55f, 23f, 14f, 23f)
                horizontalLineTo(10f)
                curveTo(9.45f, 23f, 9f, 22.55f, 9f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                curveTo(9f, 19.45f, 9.45f, 19f, 10f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                curveTo(2.89f, 17f, 2f, 16.11f, 2f, 15f)
                lineTo(2f, 3f)
                curveTo(2f, 1.89f, 2.9f, 1f, 4f, 1f)
                horizontalLineTo(20f)
                curveTo(21.11f, 1f, 22f, 1.89f, 22f, 3f)
                lineTo(22f, 15f)
                curveTo(22f, 16.11f, 21.11f, 17f, 20f, 17f)
                horizontalLineTo(13f)
                moveTo(20f, 15f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                lineTo(20f, 15f)
                moveTo(11f, 6f)
                horizontalLineTo(19f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                moveTo(5f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                moveTo(13f, 14f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _NetworkPos!!
    }

@Suppress("ObjectPropertyName")
private var _NetworkPos: ImageVector? = null
