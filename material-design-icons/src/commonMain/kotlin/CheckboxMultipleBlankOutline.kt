package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckboxMultipleBlankOutline: ImageVector
    get() {
        if (_CheckboxMultipleBlankOutline != null) {
            return _CheckboxMultipleBlankOutline!!
        }
        _CheckboxMultipleBlankOutline = ImageVector.Builder(
            name = "CheckboxMultipleBlankOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 16f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                moveTo(22f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 18f)
                horizontalLineTo(8f)
                curveTo(6.89f, 18f, 6f, 17.1f, 6f, 16f)
                verticalLineTo(4f)
                curveTo(6f, 2.89f, 6.89f, 2f, 8f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                verticalLineTo(16f)
                moveTo(16f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _CheckboxMultipleBlankOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CheckboxMultipleBlankOutline: ImageVector? = null
