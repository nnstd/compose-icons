package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Altimeter: ImageVector
    get() {
        if (_Altimeter != null) {
            return _Altimeter!!
        }
        _Altimeter = ImageVector.Builder(
            name = "Altimeter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                moveTo(9f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                moveTo(2f, 7.96f)
                verticalLineTo(16.04f)
                lineTo(6.03f, 12f)
                lineTo(2f, 7.96f)
                moveTo(22.03f, 7.96f)
                lineTo(18f, 12f)
                lineTo(22.03f, 16.04f)
                verticalLineTo(7.96f)
                moveTo(7f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                moveTo(9f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                moveTo(7f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _Altimeter!!
    }

@Suppress("ObjectPropertyName")
private var _Altimeter: ImageVector? = null
