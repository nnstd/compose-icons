package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarThreePointsOutline: ImageVector
    get() {
        if (_StarThreePointsOutline != null) {
            return _StarThreePointsOutline!!
        }
        _StarThreePointsOutline = ImageVector.Builder(
            name = "StarThreePointsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9.5f)
                lineTo(13.2f, 13.5f)
                lineTo(16f, 16.5f)
                lineTo(12f, 15.6f)
                lineTo(7.9f, 16.5f)
                lineTo(10.7f, 13.5f)
                lineTo(12f, 9.5f)
                moveTo(12f, 2.6f)
                lineTo(9f, 12.4f)
                lineTo(2f, 19.9f)
                lineTo(12f, 17.6f)
                lineTo(22f, 20f)
                lineTo(15f, 12.5f)
                lineTo(12f, 2.6f)
                close()
            }
        }.build()

        return _StarThreePointsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StarThreePointsOutline: ImageVector? = null
