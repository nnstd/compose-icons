package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Unity: ImageVector
    get() {
        if (_Unity != null) {
            return _Unity!!
        }
        _Unity = ImageVector.Builder(
            name = "Unity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.11f, 17f)
                horizontalLineTo(7.5f)
                lineTo(2.59f, 12f)
                lineTo(7.5f, 7f)
                horizontalLineTo(10.11f)
                lineTo(11.42f, 4.74f)
                lineTo(18.21f, 3f)
                lineTo(20.08f, 9.74f)
                lineTo(18.77f, 12f)
                lineTo(20.08f, 14.26f)
                lineTo(18.21f, 21f)
                lineTo(11.42f, 19.26f)
                lineTo(10.11f, 17f)
                moveTo(10.25f, 16.75f)
                lineTo(15.38f, 18.13f)
                lineTo(12.42f, 13f)
                horizontalLineTo(6.5f)
                lineTo(10.25f, 16.75f)
                moveTo(17.12f, 17.13f)
                lineTo(18.5f, 12f)
                lineTo(17.12f, 6.87f)
                lineTo(14.15f, 12f)
                lineTo(17.12f, 17.13f)
                moveTo(10.25f, 7.25f)
                lineTo(6.5f, 11f)
                horizontalLineTo(12.42f)
                lineTo(15.38f, 5.87f)
                lineTo(10.25f, 7.25f)
                close()
            }
        }.build()

        return _Unity!!
    }

@Suppress("ObjectPropertyName")
private var _Unity: ImageVector? = null
