package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Atm: ImageVector
    get() {
        if (_Atm != null) {
            return _Atm!!
        }
        _Atm = ImageVector.Builder(
            name = "Atm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 9f)
                verticalLineTo(10.5f)
                horizontalLineTo(10.25f)
                verticalLineTo(15f)
                horizontalLineTo(11.75f)
                verticalLineTo(10.5f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                moveTo(6f, 9f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(3.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 9f)
                moveTo(5.5f, 12f)
                horizontalLineTo(3.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(12f)
                moveTo(21f, 9f)
                horizontalLineTo(16.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(10.5f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(19.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(20.5f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 9f)
                close()
            }
        }.build()

        return _Atm!!
    }

@Suppress("ObjectPropertyName")
private var _Atm: ImageVector? = null
