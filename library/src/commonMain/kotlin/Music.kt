package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Music: ImageVector
    get() {
        if (_Music != null) {
            return _Music!!
        }
        _Music = ImageVector.Builder(
            name = "Music",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                verticalLineTo(15.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 19f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 15.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 12f)
                curveTo(18.04f, 12f, 18.55f, 12.12f, 19f, 12.34f)
                verticalLineTo(6.47f)
                lineTo(9f, 8.6f)
                verticalLineTo(17.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 21f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 17.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 14f)
                curveTo(6.04f, 14f, 6.55f, 14.12f, 7f, 14.34f)
                verticalLineTo(6f)
                lineTo(21f, 3f)
                close()
            }
        }.build()

        return _Music!!
    }

@Suppress("ObjectPropertyName")
private var _Music: ImageVector? = null
