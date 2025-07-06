package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckboxMultipleOutline: ImageVector
    get() {
        if (_CheckboxMultipleOutline != null) {
            return _CheckboxMultipleOutline!!
        }
        _CheckboxMultipleOutline = ImageVector.Builder(
            name = "CheckboxMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 18f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 16f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 2f)
                moveTo(20f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                moveTo(16f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                moveTo(18.53f, 8.06f)
                lineTo(17.47f, 7f)
                lineTo(12.59f, 11.88f)
                lineTo(10.47f, 9.76f)
                lineTo(9.41f, 10.82f)
                lineTo(12.59f, 14f)
                lineTo(18.53f, 8.06f)
                close()
            }
        }.build()

        return _CheckboxMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CheckboxMultipleOutline: ImageVector? = null
