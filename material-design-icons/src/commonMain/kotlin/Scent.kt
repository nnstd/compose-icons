package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Scent: ImageVector
    get() {
        if (_Scent != null) {
            return _Scent!!
        }
        _Scent = ImageVector.Builder(
            name = "Scent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 5.1f)
                curveTo(18.5f, 6.4f, 19f, 7.6f, 19f, 9f)
                curveTo(19f, 10.7f, 18.3f, 12.3f, 16.6f, 14.1f)
                curveTo(14.7f, 16.1f, 13f, 18.3f, 13f, 20.5f)
                curveTo(13f, 20.9f, 13.1f, 21.3f, 13.2f, 21.8f)
                curveTo(13.2f, 21.9f, 13.2f, 22f, 13.1f, 22.1f)
                curveTo(13f, 22.2f, 12.9f, 22.1f, 12.9f, 22f)
                curveTo(11.9f, 20.7f, 11.4f, 19.5f, 11.4f, 18.1f)
                curveTo(11.4f, 16.4f, 12.1f, 14.8f, 13.8f, 13f)
                curveTo(15.7f, 11f, 17.4f, 8.8f, 17.4f, 6.6f)
                curveTo(17.4f, 6.2f, 17.3f, 5.8f, 17.2f, 5.3f)
                curveTo(17.2f, 5.2f, 17.2f, 5.1f, 17.3f, 5f)
                curveTo(17.4f, 5f, 17.4f, 5f, 17.5f, 5.1f)
                moveTo(9.7f, 2.1f)
                curveTo(10.4f, 3f, 10.7f, 4f, 10.7f, 4.9f)
                curveTo(10.7f, 6.2f, 10.1f, 7.4f, 8.9f, 8.7f)
                curveTo(7.5f, 10.2f, 6.2f, 11.9f, 6.2f, 13.5f)
                curveTo(6.2f, 13.8f, 6.3f, 14.2f, 6.4f, 14.4f)
                curveTo(6.4f, 14.5f, 6.4f, 14.5f, 6.3f, 14.6f)
                curveTo(6.2f, 14.7f, 6.1f, 14.6f, 6.1f, 14.6f)
                curveTo(5.3f, 13.6f, 5f, 12.6f, 5f, 11.7f)
                curveTo(5f, 10.4f, 5.6f, 9.2f, 6.8f, 7.9f)
                curveTo(8.2f, 6.4f, 9.5f, 4.7f, 9.5f, 3.1f)
                curveTo(9.5f, 2.8f, 9.4f, 2.4f, 9.3f, 2.2f)
                verticalLineTo(2f)
                curveTo(9.5f, 2f, 9.6f, 2f, 9.7f, 2.1f)
                moveTo(10.1f, 9.9f)
                curveTo(12f, 7.9f, 13.7f, 5.7f, 13.7f, 3.5f)
                curveTo(13.7f, 3.1f, 13.6f, 2.7f, 13.5f, 2.2f)
                curveTo(13.5f, 2.1f, 13.5f, 2f, 13.6f, 1.9f)
                curveTo(13.7f, 1.8f, 13.8f, 1.9f, 13.8f, 2f)
                curveTo(14.8f, 3.3f, 15.3f, 4.5f, 15.3f, 5.9f)
                curveTo(15.3f, 7.6f, 14.6f, 9.2f, 12.9f, 11f)
                curveTo(11f, 13f, 9.3f, 15.2f, 9.3f, 17.4f)
                curveTo(9.3f, 17.8f, 9.4f, 18.2f, 9.5f, 18.7f)
                curveTo(9.5f, 18.8f, 9.5f, 18.9f, 9.4f, 19f)
                curveTo(9.3f, 19.1f, 9.2f, 19f, 9.2f, 18.9f)
                curveTo(8.2f, 17.6f, 7.7f, 16.4f, 7.7f, 15f)
                curveTo(7.7f, 13.3f, 8.4f, 11.7f, 10.1f, 9.9f)
                close()
            }
        }.build()

        return _Scent!!
    }

@Suppress("ObjectPropertyName")
private var _Scent: ImageVector? = null
