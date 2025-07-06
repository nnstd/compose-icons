package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowLeftCircle: ImageVector
    get() {
        if (_ArrowLeftCircle != null) {
            return _ArrowLeftCircle!!
        }
        _ArrowLeftCircle = ImageVector.Builder(
            name = "ArrowLeftCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                moveTo(18f, 11f)
                horizontalLineTo(10f)
                lineTo(13.5f, 7.5f)
                lineTo(12.08f, 6.08f)
                lineTo(6.16f, 12f)
                lineTo(12.08f, 17.92f)
                lineTo(13.5f, 16.5f)
                lineTo(10f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _ArrowLeftCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftCircle: ImageVector? = null
