package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUpCircle: ImageVector
    get() {
        if (_ArrowUpCircle != null) {
            return _ArrowUpCircle!!
        }
        _ArrowUpCircle = ImageVector.Builder(
            name = "ArrowUpCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 18f)
                verticalLineTo(10f)
                lineTo(16.5f, 13.5f)
                lineTo(17.92f, 12.08f)
                lineTo(12f, 6.16f)
                lineTo(6.08f, 12.08f)
                lineTo(7.5f, 13.5f)
                lineTo(11f, 10f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
            }
        }.build()

        return _ArrowUpCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpCircle: ImageVector? = null
