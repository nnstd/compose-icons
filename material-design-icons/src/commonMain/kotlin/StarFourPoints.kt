package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarFourPoints: ImageVector
    get() {
        if (_StarFourPoints != null) {
            return _StarFourPoints!!
        }
        _StarFourPoints = ImageVector.Builder(
            name = "StarFourPoints",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                lineTo(9f, 9f)
                lineTo(1f, 12f)
                lineTo(9f, 15f)
                lineTo(12f, 23f)
                lineTo(15f, 15f)
                lineTo(23f, 12f)
                lineTo(15f, 9f)
                lineTo(12f, 1f)
                close()
            }
        }.build()

        return _StarFourPoints!!
    }

@Suppress("ObjectPropertyName")
private var _StarFourPoints: ImageVector? = null
