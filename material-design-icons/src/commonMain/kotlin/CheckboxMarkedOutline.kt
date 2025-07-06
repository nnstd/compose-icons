package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckboxMarkedOutline: ImageVector
    get() {
        if (_CheckboxMarkedOutline != null) {
            return _CheckboxMarkedOutline!!
        }
        _CheckboxMarkedOutline = ImageVector.Builder(
            name = "CheckboxMarkedOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                moveTo(7.91f, 10.08f)
                lineTo(6.5f, 11.5f)
                lineTo(11f, 16f)
                lineTo(21f, 6f)
                lineTo(19.59f, 4.58f)
                lineTo(11f, 13.17f)
                lineTo(7.91f, 10.08f)
                close()
            }
        }.build()

        return _CheckboxMarkedOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CheckboxMarkedOutline: ImageVector? = null
