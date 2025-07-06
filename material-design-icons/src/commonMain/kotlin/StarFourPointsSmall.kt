package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarFourPointsSmall: ImageVector
    get() {
        if (_StarFourPointsSmall != null) {
            return _StarFourPointsSmall!!
        }
        _StarFourPointsSmall = ImageVector.Builder(
            name = "StarFourPointsSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.74f, 10.75f)
                lineTo(12f, 8f)
                lineTo(13.25f, 10.75f)
                lineTo(16f, 12f)
                lineTo(13.25f, 13.26f)
                lineTo(12f, 16f)
                lineTo(10.74f, 13.26f)
                lineTo(8f, 12f)
                lineTo(10.74f, 10.75f)
                close()
            }
        }.build()

        return _StarFourPointsSmall!!
    }

@Suppress("ObjectPropertyName")
private var _StarFourPointsSmall: ImageVector? = null
