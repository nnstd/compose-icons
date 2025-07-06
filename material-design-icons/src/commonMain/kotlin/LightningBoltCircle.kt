package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightningBoltCircle: ImageVector
    get() {
        if (_LightningBoltCircle != null) {
            return _LightningBoltCircle!!
        }
        _LightningBoltCircle = ImageVector.Builder(
            name = "LightningBoltCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 20f)
                lineTo(16.36f, 10.27f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                lineTo(8f, 13.73f)
                horizontalLineTo(11.5f)
                verticalLineTo(20f)
                moveTo(12f, 2f)
                curveTo(14.75f, 2f, 17.1f, 3f, 19.05f, 4.95f)
                curveTo(21f, 6.9f, 22f, 9.25f, 22f, 12f)
                curveTo(22f, 14.75f, 21f, 17.1f, 19.05f, 19.05f)
                curveTo(17.1f, 21f, 14.75f, 22f, 12f, 22f)
                curveTo(9.25f, 22f, 6.9f, 21f, 4.95f, 19.05f)
                curveTo(3f, 17.1f, 2f, 14.75f, 2f, 12f)
                curveTo(2f, 9.25f, 3f, 6.9f, 4.95f, 4.95f)
                curveTo(6.9f, 3f, 9.25f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _LightningBoltCircle!!
    }

@Suppress("ObjectPropertyName")
private var _LightningBoltCircle: ImageVector? = null
