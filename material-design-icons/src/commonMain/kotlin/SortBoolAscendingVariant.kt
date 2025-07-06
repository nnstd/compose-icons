package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SortBoolAscendingVariant: ImageVector
    get() {
        if (_SortBoolAscendingVariant != null) {
            return _SortBoolAscendingVariant!!
        }
        _SortBoolAscendingVariant = ImageVector.Builder(
            name = "SortBoolAscendingVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 17f)
                horizontalLineTo(22f)
                lineTo(18f, 21f)
                lineTo(14f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                moveTo(9f, 13f)
                horizontalLineTo(5f)
                curveTo(3.89f, 13f, 3f, 13.89f, 3f, 15f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(9f)
                curveTo(10.11f, 21f, 11f, 20.11f, 11f, 19f)
                verticalLineTo(15f)
                curveTo(11f, 13.89f, 10.11f, 13f, 9f, 13f)
                moveTo(6.27f, 19.5f)
                lineTo(3.74f, 16.95f)
                lineTo(4.81f, 15.9f)
                lineTo(6.28f, 17.39f)
                lineTo(9.2f, 14.5f)
                lineTo(10.26f, 15.55f)
                lineTo(6.27f, 19.5f)
                moveTo(9f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(9f)
                curveTo(3f, 10.11f, 3.89f, 11f, 5f, 11f)
                horizontalLineTo(9f)
                curveTo(10.11f, 11f, 11f, 10.11f, 11f, 9f)
                verticalLineTo(5f)
                curveTo(11f, 3.89f, 10.11f, 3f, 9f, 3f)
                moveTo(9f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _SortBoolAscendingVariant!!
    }

@Suppress("ObjectPropertyName")
private var _SortBoolAscendingVariant: ImageVector? = null
