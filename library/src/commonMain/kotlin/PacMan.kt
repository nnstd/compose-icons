package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PacMan: ImageVector
    get() {
        if (_PacMan != null) {
            return _PacMan!!
        }
        _PacMan = ImageVector.Builder(
            name = "PacMan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                lineTo(19.07f, 19.07f)
                curveTo(15.17f, 23f, 8.83f, 23f, 4.93f, 19.07f)
                curveTo(1f, 15.17f, 1f, 8.84f, 4.93f, 4.93f)
                curveTo(8.83f, 1f, 15.16f, 1f, 19.07f, 4.93f)
                lineTo(12f, 12f)
                moveTo(19f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10f)
                close()
            }
        }.build()

        return _PacMan!!
    }

@Suppress("ObjectPropertyName")
private var _PacMan: ImageVector? = null
