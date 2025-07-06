package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarThreePoints: ImageVector
    get() {
        if (_StarThreePoints != null) {
            return _StarThreePoints!!
        }
        _StarThreePoints = ImageVector.Builder(
            name = "StarThreePoints",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
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

        return _StarThreePoints!!
    }

@Suppress("ObjectPropertyName")
private var _StarThreePoints: ImageVector? = null
