package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LeafCircle: ImageVector
    get() {
        if (_LeafCircle != null) {
            return _LeafCircle!!
        }
        _LeafCircle = ImageVector.Builder(
            name = "LeafCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                moveTo(9.6f, 17.2f)
                curveTo(9.38f, 17.2f, 9.08f, 17.12f, 8.8f, 17f)
                lineTo(8.23f, 18.4f)
                lineTo(7.09f, 18f)
                lineTo(7.25f, 17.61f)
                curveTo(8.45f, 14.59f, 9.83f, 11.15f, 15f, 10f)
                curveTo(15f, 10f, 9f, 10f, 7.05f, 15.55f)
                curveTo(7.05f, 15.55f, 6f, 14.5f, 6f, 13.3f)
                reflectiveCurveTo(7.2f, 9.55f, 10.2f, 8.95f)
                curveTo(11.05f, 8.78f, 12f, 8.65f, 12.94f, 8.5f)
                curveTo(15.3f, 8.18f, 17.57f, 7.86f, 18f, 7f)
                curveTo(18f, 7f, 16.2f, 17.2f, 9.6f, 17.2f)
                close()
            }
        }.build()

        return _LeafCircle!!
    }

@Suppress("ObjectPropertyName")
private var _LeafCircle: ImageVector? = null
