package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pound: ImageVector
    get() {
        if (_Pound != null) {
            return _Pound!!
        }
        _Pound = ImageVector.Builder(
            name = "Pound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.41f, 21f)
                lineTo(6.12f, 17f)
                horizontalLineTo(2.12f)
                lineTo(2.47f, 15f)
                horizontalLineTo(6.47f)
                lineTo(7.53f, 9f)
                horizontalLineTo(3.53f)
                lineTo(3.88f, 7f)
                horizontalLineTo(7.88f)
                lineTo(8.59f, 3f)
                horizontalLineTo(10.59f)
                lineTo(9.88f, 7f)
                horizontalLineTo(15.88f)
                lineTo(16.59f, 3f)
                horizontalLineTo(18.59f)
                lineTo(17.88f, 7f)
                horizontalLineTo(21.88f)
                lineTo(21.53f, 9f)
                horizontalLineTo(17.53f)
                lineTo(16.47f, 15f)
                horizontalLineTo(20.47f)
                lineTo(20.12f, 17f)
                horizontalLineTo(16.12f)
                lineTo(15.41f, 21f)
                horizontalLineTo(13.41f)
                lineTo(14.12f, 17f)
                horizontalLineTo(8.12f)
                lineTo(7.41f, 21f)
                horizontalLineTo(5.41f)
                moveTo(9.53f, 9f)
                lineTo(8.47f, 15f)
                horizontalLineTo(14.47f)
                lineTo(15.53f, 9f)
                horizontalLineTo(9.53f)
                close()
            }
        }.build()

        return _Pound!!
    }

@Suppress("ObjectPropertyName")
private var _Pound: ImageVector? = null
