package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SilverwareClean: ImageVector
    get() {
        if (_SilverwareClean != null) {
            return _SilverwareClean!!
        }
        _SilverwareClean = ImageVector.Builder(
            name = "SilverwareClean",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 0f)
                lineTo(14.38f, 1.37f)
                lineTo(13f, 2f)
                lineTo(14.38f, 2.63f)
                lineTo(15f, 4f)
                lineTo(15.63f, 2.63f)
                lineTo(17f, 2f)
                lineTo(15.63f, 1.37f)
                lineTo(15f, 0f)
                moveTo(10.5f, 2f)
                lineTo(9.41f, 4.41f)
                lineTo(7f, 5.5f)
                lineTo(9.41f, 6.59f)
                lineTo(10.5f, 9f)
                lineTo(11.6f, 6.59f)
                lineTo(14f, 5.5f)
                lineTo(11.6f, 4.41f)
                lineTo(10.5f, 2f)
                moveTo(18.89f, 5.14f)
                curveTo(17.56f, 5.06f, 16.04f, 5.65f, 14.84f, 6.84f)
                curveTo(13.25f, 8.43f, 12.75f, 10.58f, 13.46f, 12.11f)
                lineTo(3.7f, 21.87f)
                lineTo(5.11f, 23.28f)
                lineTo(12f, 16.41f)
                lineTo(18.88f, 23.29f)
                lineTo(20.29f, 21.88f)
                lineTo(13.41f, 15f)
                lineTo(14.88f, 13.53f)
                curveTo(16.41f, 14.24f, 18.56f, 13.74f, 20.15f, 12.15f)
                curveTo(22.06f, 10.24f, 22.43f, 7.5f, 20.96f, 6.03f)
                curveTo(20.41f, 5.5f, 19.68f, 5.19f, 18.89f, 5.14f)
                moveTo(3.91f, 5.5f)
                curveTo(2.35f, 7.06f, 2.35f, 9.59f, 3.91f, 11.16f)
                lineTo(8.1f, 15.34f)
                lineTo(10.93f, 12.5f)
                lineTo(3.91f, 5.5f)
                close()
            }
        }.build()

        return _SilverwareClean!!
    }

@Suppress("ObjectPropertyName")
private var _SilverwareClean: ImageVector? = null
