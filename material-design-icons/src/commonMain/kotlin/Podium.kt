package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Podium: ImageVector
    get() {
        if (_Podium != null) {
            return _Podium!!
        }
        _Podium = ImageVector.Builder(
            name = "Podium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.09f)
                lineTo(14.45f, 8.58f)
                lineTo(13.8f, 5.77f)
                lineTo(16f, 3.89f)
                lineTo(13.11f, 3.64f)
                lineTo(12f, 1f)
                lineTo(10.87f, 3.64f)
                lineTo(8f, 3.89f)
                lineTo(10.18f, 5.77f)
                lineTo(9.5f, 8.58f)
                lineTo(12f, 7.09f)
                moveTo(4f, 13.09f)
                lineTo(6.45f, 14.58f)
                lineTo(5.8f, 11.77f)
                lineTo(8f, 9.89f)
                lineTo(5.11f, 9.64f)
                lineTo(4f, 7f)
                lineTo(2.87f, 9.64f)
                lineTo(0f, 9.89f)
                lineTo(2.18f, 11.77f)
                lineTo(1.5f, 14.58f)
                lineTo(4f, 13.09f)
                moveTo(20f, 10.09f)
                lineTo(22.45f, 11.58f)
                lineTo(21.8f, 8.77f)
                lineTo(24f, 6.89f)
                lineTo(21.11f, 6.64f)
                lineTo(20f, 4f)
                lineTo(18.87f, 6.64f)
                lineTo(16f, 6.89f)
                lineTo(18.18f, 8.77f)
                lineTo(17.5f, 11.58f)
                lineTo(20f, 10.09f)
                moveTo(15f, 23f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(23f)
                moveTo(7f, 23f)
                horizontalLineTo(1f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(23f)
                moveTo(23f, 23f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                verticalLineTo(23f)
                close()
            }
        }.build()

        return _Podium!!
    }

@Suppress("ObjectPropertyName")
private var _Podium: ImageVector? = null
