package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarFourPointsOutline: ImageVector
    get() {
        if (_StarFourPointsOutline != null) {
            return _StarFourPointsOutline!!
        }
        _StarFourPointsOutline = ImageVector.Builder(
            name = "StarFourPointsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6.7f)
                lineTo(13.45f, 10.55f)
                lineTo(17.3f, 12f)
                lineTo(13.45f, 13.45f)
                lineTo(12f, 17.3f)
                lineTo(10.55f, 13.45f)
                lineTo(6.7f, 12f)
                lineTo(10.55f, 10.55f)
                lineTo(12f, 6.7f)
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

        return _StarFourPointsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StarFourPointsOutline: ImageVector? = null
