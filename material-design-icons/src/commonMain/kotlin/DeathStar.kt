package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DeathStar: ImageVector
    get() {
        if (_DeathStar != null) {
            return _DeathStar!!
        }
        _DeathStar = ImageVector.Builder(
            name = "DeathStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.05f, 13f)
                horizontalLineTo(21.95f)
                curveTo(21.45f, 18.05f, 17.19f, 22f, 12f, 22f)
                curveTo(6.82f, 22f, 2.55f, 18.05f, 2.05f, 13f)
                moveTo(21.95f, 11f)
                horizontalLineTo(2.05f)
                curveTo(2.55f, 5.95f, 6.82f, 2f, 12f, 2f)
                curveTo(17.18f, 2f, 21.45f, 5.95f, 21.95f, 11f)
                moveTo(12f, 6.75f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 4.25f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 6.75f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 9.25f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6.75f)
                close()
            }
        }.build()

        return _DeathStar!!
    }

@Suppress("ObjectPropertyName")
private var _DeathStar: ImageVector? = null
