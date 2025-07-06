package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckboxMultipleMarked: ImageVector
    get() {
        if (_CheckboxMultipleMarked != null) {
            return _CheckboxMultipleMarked!!
        }
        _CheckboxMultipleMarked = ImageVector.Builder(
            name = "CheckboxMultipleMarked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(13f, 14f)
                lineTo(20f, 7f)
                lineTo(18.59f, 5.59f)
                lineTo(13f, 11.17f)
                lineTo(9.91f, 8.09f)
                lineTo(8.5f, 9.5f)
                lineTo(13f, 14f)
                close()
            }
        }.build()

        return _CheckboxMultipleMarked!!
    }

@Suppress("ObjectPropertyName")
private var _CheckboxMultipleMarked: ImageVector? = null
