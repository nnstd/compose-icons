package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowLeftBoldBoxOutline: ImageVector
    get() {
        if (_ArrowLeftBoldBoxOutline != null) {
            return _ArrowLeftBoldBoxOutline!!
        }
        _ArrowLeftBoldBoxOutline = ImageVector.Builder(
            name = "ArrowLeftBoldBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 12f)
                lineTo(12f, 7f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                lineTo(7f, 12f)
                moveTo(21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                moveTo(19f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _ArrowLeftBoldBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftBoldBoxOutline: ImageVector? = null
