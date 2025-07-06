package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Summit: ImageVector
    get() {
        if (_Summit != null) {
            return _Summit!!
        }
        _Summit = ImageVector.Builder(
            name = "Summit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 3f)
                horizontalLineTo(17f)
                lineTo(22f, 5f)
                lineTo(17f, 7f)
                verticalLineTo(10.17f)
                lineTo(22f, 21f)
                horizontalLineTo(2f)
                lineTo(8f, 13f)
                lineTo(11.5f, 17.7f)
                lineTo(15f, 10.17f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _Summit!!
    }

@Suppress("ObjectPropertyName")
private var _Summit: ImageVector? = null
