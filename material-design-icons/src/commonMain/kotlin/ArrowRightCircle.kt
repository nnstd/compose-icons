package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowRightCircle: ImageVector
    get() {
        if (_ArrowRightCircle != null) {
            return _ArrowRightCircle!!
        }
        _ArrowRightCircle = ImageVector.Builder(
            name = "ArrowRightCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                moveTo(6f, 13f)
                horizontalLineTo(14f)
                lineTo(10.5f, 16.5f)
                lineTo(11.92f, 17.92f)
                lineTo(17.84f, 12f)
                lineTo(11.92f, 6.08f)
                lineTo(10.5f, 7.5f)
                lineTo(14f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _ArrowRightCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightCircle: ImageVector? = null
