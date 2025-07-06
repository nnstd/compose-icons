package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowLeftBoldCircle: ImageVector
    get() {
        if (_ArrowLeftBoldCircle != null) {
            return _ArrowLeftBoldCircle!!
        }
        _ArrowLeftBoldCircle = ImageVector.Builder(
            name = "ArrowLeftBoldCircle",
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
                moveTo(7f, 12f)
                lineTo(12f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                lineTo(7f, 12f)
                close()
            }
        }.build()

        return _ArrowLeftBoldCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftBoldCircle: ImageVector? = null
