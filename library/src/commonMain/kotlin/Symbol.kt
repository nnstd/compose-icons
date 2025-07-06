package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Symbol: ImageVector
    get() {
        if (_Symbol != null) {
            return _Symbol!!
        }
        _Symbol = ImageVector.Builder(
            name = "Symbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 7f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                moveTo(6f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                curveTo(11.11f, 13f, 12f, 12.11f, 12f, 11f)
                verticalLineTo(9f)
                curveTo(12f, 7.89f, 11.11f, 7f, 10f, 7f)
                horizontalLineTo(6f)
                moveTo(15.8f, 7f)
                lineTo(15.6f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(15.4f)
                lineTo(15.2f, 13f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                lineTo(14.8f, 17f)
                horizontalLineTo(16.8f)
                lineTo(17f, 15f)
                horizontalLineTo(18.4f)
                lineTo(18.2f, 17f)
                horizontalLineTo(20.2f)
                lineTo(20.4f, 15f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(20.6f)
                lineTo(20.8f, 11f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                lineTo(21.2f, 7f)
                horizontalLineTo(19.2f)
                lineTo(19f, 9f)
                horizontalLineTo(17.6f)
                lineTo(17.8f, 7f)
                horizontalLineTo(15.8f)
                moveTo(17.4f, 11f)
                horizontalLineTo(18.8f)
                lineTo(18.6f, 13f)
                horizontalLineTo(17.2f)
                lineTo(17.4f, 11f)
                moveTo(2f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(2f)
                moveTo(8f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _Symbol!!
    }

@Suppress("ObjectPropertyName")
private var _Symbol: ImageVector? = null
