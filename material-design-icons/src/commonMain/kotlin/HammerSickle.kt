package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HammerSickle: ImageVector
    get() {
        if (_HammerSickle != null) {
            return _HammerSickle!!
        }
        _HammerSickle = ImageVector.Builder(
            name = "HammerSickle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 20.59f)
                lineTo(20.59f, 22f)
                lineTo(17.45f, 18.86f)
                curveTo(16.89f, 19.23f, 16.3f, 19.56f, 15.66f, 19.78f)
                curveTo(14f, 20.36f, 12.2f, 20.4f, 10.53f, 19.88f)
                curveTo(9.5f, 19.58f, 8.56f, 19.05f, 7.75f, 18.37f)
                lineTo(4.56f, 21.56f)
                curveTo(4f, 22.15f, 3.03f, 22.15f, 2.44f, 21.56f)
                curveTo(1.86f, 21f, 1.86f, 20f, 2.44f, 19.44f)
                lineTo(5.82f, 16.06f)
                lineTo(8.47f, 15.54f)
                curveTo(9.19f, 16.45f, 10.19f, 17.13f, 11.28f, 17.5f)
                curveTo(12.44f, 17.85f, 13.72f, 17.84f, 14.87f, 17.46f)
                curveTo(15.16f, 17.37f, 15.44f, 17.26f, 15.7f, 17.12f)
                lineTo(7.6f, 9f)
                lineTo(5.83f, 10.78f)
                lineTo(3f, 7.95f)
                lineTo(7.95f, 3f)
                lineTo(12.19f, 4.41f)
                lineTo(9f, 7.6f)
                lineTo(17.31f, 15.89f)
                curveTo(17.5f, 15.71f, 17.65f, 15.53f, 17.8f, 15.33f)
                curveTo(19.3f, 13.36f, 19.42f, 10.42f, 18.09f, 8f)
                curveTo(16.78f, 5.57f, 14.5f, 3.55f, 12f, 2f)
                curveTo(13.41f, 2.5f, 14.76f, 3.17f, 16f, 4.04f)
                curveTo(17.24f, 4.91f, 18.43f, 5.93f, 19.33f, 7.25f)
                curveTo(20.23f, 8.54f, 20.87f, 10.12f, 21f, 11.79f)
                curveTo(21.1f, 13.47f, 20.66f, 15.23f, 19.7f, 16.65f)
                curveTo(19.5f, 17f, 19.24f, 17.28f, 19f, 17.56f)
                lineTo(22f, 20.59f)
                close()
            }
        }.build()

        return _HammerSickle!!
    }

@Suppress("ObjectPropertyName")
private var _HammerSickle: ImageVector? = null
