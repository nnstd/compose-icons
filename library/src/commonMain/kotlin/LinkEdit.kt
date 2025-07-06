package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LinkEdit: ImageVector
    get() {
        if (_LinkEdit != null) {
            return _LinkEdit!!
        }
        _LinkEdit = ImageVector.Builder(
            name = "LinkEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 22f)
                verticalLineTo(19.96f)
                lineTo(19.13f, 13.83f)
                lineTo(21.17f, 15.88f)
                lineTo(15.04f, 22f)
                horizontalLineTo(13f)
                moveTo(21.53f, 12.15f)
                lineTo(22.85f, 13.47f)
                curveTo(23.05f, 13.67f, 23.05f, 14f, 22.85f, 14.19f)
                lineTo(21.87f, 15.17f)
                lineTo(19.83f, 13.13f)
                lineTo(20.81f, 12.15f)
                curveTo(21f, 11.95f, 21.33f, 11.95f, 21.53f, 12.15f)
                moveTo(20.54f, 8.46f)
                curveTo(20.73f, 8.65f, 20.9f, 8.86f, 21.06f, 9.08f)
                lineTo(19.68f, 10.45f)
                curveTo(19.15f, 9.5f, 18.15f, 8.9f, 17f, 8.9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                curveTo(18.33f, 7f, 19.6f, 7.53f, 20.54f, 8.46f)
                moveTo(3.9f, 12f)
                curveTo(3.9f, 10.29f, 5.29f, 8.9f, 7f, 8.9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                curveTo(5.67f, 7f, 4.4f, 7.53f, 3.46f, 8.46f)
                curveTo(2.53f, 9.4f, 2f, 10.67f, 2f, 12f)
                curveTo(2f, 13.33f, 2.53f, 14.6f, 3.46f, 15.54f)
                curveTo(4.4f, 16.47f, 5.67f, 17f, 7f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(15.1f)
                horizontalLineTo(7f)
                curveTo(5.29f, 15.1f, 3.9f, 13.71f, 3.9f, 12f)
                moveTo(8f, 13f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _LinkEdit!!
    }

@Suppress("ObjectPropertyName")
private var _LinkEdit: ImageVector? = null
