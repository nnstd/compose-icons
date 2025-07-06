package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowDownCircle: ImageVector
    get() {
        if (_ArrowDownCircle != null) {
            return _ArrowDownCircle!!
        }
        _ArrowDownCircle = ImageVector.Builder(
            name = "ArrowDownCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 6f)
                verticalLineTo(14f)
                lineTo(7.5f, 10.5f)
                lineTo(6.08f, 11.92f)
                lineTo(12f, 17.84f)
                lineTo(17.92f, 11.92f)
                lineTo(16.5f, 10.5f)
                lineTo(13f, 14f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
            }
        }.build()

        return _ArrowDownCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownCircle: ImageVector? = null
