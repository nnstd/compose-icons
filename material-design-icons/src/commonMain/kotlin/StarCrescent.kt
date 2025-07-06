package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarCrescent: ImageVector
    get() {
        if (_StarCrescent != null) {
            return _StarCrescent!!
        }
        _StarCrescent = ImageVector.Builder(
            name = "StarCrescent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.3f, 2f)
                curveTo(12.2f, 2f, 12.1f, 2f, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                curveTo(15f, 22f, 16.7f, 21f, 18.5f, 19.5f)
                curveTo(13f, 21f, 8f, 17f, 8f, 12f)
                curveTo(8f, 7f, 13f, 3f, 18.5f, 4.5f)
                curveTo(16.86f, 2.86f, 14.62f, 1.96f, 12.3f, 2f)
                moveTo(16.8f, 6.2f)
                lineTo(15.3f, 9.7f)
                lineTo(11.6f, 10f)
                lineTo(14.5f, 12.5f)
                lineTo(13.6f, 16f)
                lineTo(16.8f, 14f)
                lineTo(20f, 16f)
                lineTo(19f, 12.5f)
                lineTo(22f, 10f)
                lineTo(18.3f, 9.7f)
                lineTo(16.8f, 6.2f)
                close()
            }
        }.build()

        return _StarCrescent!!
    }

@Suppress("ObjectPropertyName")
private var _StarCrescent: ImageVector? = null
