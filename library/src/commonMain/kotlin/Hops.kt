package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Hops: ImageVector
    get() {
        if (_Hops != null) {
            return _Hops!!
        }
        _Hops = ImageVector.Builder(
            name = "Hops",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 12f)
                curveTo(21f, 12f, 12.5f, 10f, 12.5f, 2f)
                curveTo(12.5f, 2f, 21f, 2f, 21f, 12f)
                moveTo(3f, 12f)
                curveTo(3f, 2f, 11.5f, 2f, 11.5f, 2f)
                curveTo(11.5f, 10f, 3f, 12f, 3f, 12f)
                moveTo(12f, 6.5f)
                curveTo(12f, 6.5f, 13f, 8.66f, 15f, 10.5f)
                curveTo(14.76f, 14.16f, 12f, 16f, 12f, 16f)
                curveTo(12f, 16f, 9.24f, 14.16f, 9f, 10.5f)
                curveTo(11f, 8.66f, 12f, 6.5f, 12f, 6.5f)
                moveTo(20.75f, 13.25f)
                curveTo(20.75f, 13.25f, 20f, 17f, 18f, 19f)
                curveTo(18f, 19f, 15.53f, 17.36f, 14.33f, 14.81f)
                curveTo(15.05f, 13.58f, 15.5f, 12.12f, 15.75f, 11.13f)
                curveTo(17.13f, 12.18f, 18.75f, 13f, 20.75f, 13.25f)
                moveTo(15.5f, 18.25f)
                curveTo(14.5f, 20.25f, 12f, 21.75f, 12f, 21.75f)
                curveTo(12f, 21.75f, 9.5f, 20.25f, 8.5f, 18.25f)
                curveTo(8.5f, 18.25f, 9.59f, 17.34f, 10.35f, 15.8f)
                curveTo(10.82f, 16.35f, 11.36f, 16.79f, 12f, 17f)
                curveTo(12.64f, 16.79f, 13.18f, 16.35f, 13.65f, 15.8f)
                curveTo(14.41f, 17.34f, 15.5f, 18.25f, 15.5f, 18.25f)
                moveTo(3.25f, 13.25f)
                curveTo(5.25f, 13f, 6.87f, 12.18f, 8.25f, 11.13f)
                curveTo(8.5f, 12.12f, 8.95f, 13.58f, 9.67f, 14.81f)
                curveTo(8.47f, 17.36f, 6f, 19f, 6f, 19f)
                curveTo(4f, 17f, 3.25f, 13.25f, 3.25f, 13.25f)
                close()
            }
        }.build()

        return _Hops!!
    }

@Suppress("ObjectPropertyName")
private var _Hops: ImageVector? = null
