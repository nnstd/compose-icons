package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardAccountDetailsOutline: ImageVector
    get() {
        if (_CardAccountDetailsOutline != null) {
            return _CardAccountDetailsOutline!!
        }
        _CardAccountDetailsOutline = ImageVector.Builder(
            name = "CardAccountDetailsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 3f)
                horizontalLineTo(2f)
                curveTo(0.91f, 3.04f, 0.04f, 3.91f, 0f, 5f)
                verticalLineTo(19f)
                curveTo(0.04f, 20.09f, 0.91f, 20.96f, 2f, 21f)
                horizontalLineTo(22f)
                curveTo(23.09f, 20.96f, 23.96f, 20.09f, 24f, 19f)
                verticalLineTo(5f)
                curveTo(23.96f, 3.91f, 23.09f, 3.04f, 22f, 3f)
                moveTo(22f, 19f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                moveTo(14f, 17f)
                verticalLineTo(15.75f)
                curveTo(14f, 14.09f, 10.66f, 13.25f, 9f, 13.25f)
                curveTo(7.34f, 13.25f, 4f, 14.09f, 4f, 15.75f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                moveTo(9f, 7f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 7f)
                moveTo(14f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                moveTo(14f, 9f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                moveTo(14f, 11f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
            }
        }.build()

        return _CardAccountDetailsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardAccountDetailsOutline: ImageVector? = null
