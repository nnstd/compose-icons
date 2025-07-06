package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilterOff: ImageVector
    get() {
        if (_FilterOff != null) {
            return _FilterOff!!
        }
        _FilterOff = ImageVector.Builder(
            name = "FilterOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(9.5f, 11.37f)
                lineTo(9.97f, 12f)
                horizontalLineTo(10f)
                verticalLineTo(17.87f)
                curveTo(9.96f, 18.16f, 10.06f, 18.47f, 10.29f, 18.7f)
                lineTo(12.3f, 20.71f)
                curveTo(12.69f, 21.1f, 13.32f, 21.1f, 13.71f, 20.71f)
                curveTo(13.94f, 20.5f, 14.04f, 20.18f, 14f, 19.88f)
                verticalLineTo(15.89f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(14f, 13.35f)
                lineTo(9.41f, 8.76f)
                lineTo(4.15f, 3.5f)
                lineTo(2.39f, 1.73f)
                moveTo(6.21f, 3f)
                lineTo(14.54f, 11.34f)
                lineTo(19.79f, 4.62f)
                curveTo(20.13f, 4.19f, 20.05f, 3.56f, 19.62f, 3.22f)
                curveTo(19.43f, 3.08f, 19.22f, 3f, 19f, 3f)
                horizontalLineTo(6.21f)
                close()
            }
        }.build()

        return _FilterOff!!
    }

@Suppress("ObjectPropertyName")
private var _FilterOff: ImageVector? = null
