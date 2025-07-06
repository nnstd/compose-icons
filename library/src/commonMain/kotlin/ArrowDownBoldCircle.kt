package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowDownBoldCircle: ImageVector
    get() {
        if (_ArrowDownBoldCircle != null) {
            return _ArrowDownBoldCircle!!
        }
        _ArrowDownBoldCircle = ImageVector.Builder(
            name = "ArrowDownBoldCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 17f)
                lineTo(17f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                lineTo(12f, 17f)
                close()
            }
        }.build()

        return _ArrowDownBoldCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownBoldCircle: ImageVector? = null
