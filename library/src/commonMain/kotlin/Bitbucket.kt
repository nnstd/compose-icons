package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bitbucket: ImageVector
    get() {
        if (_Bitbucket != null) {
            return _Bitbucket!!
        }
        _Bitbucket = ImageVector.Builder(
            name = "Bitbucket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.65f, 3f)
                curveTo(2.3f, 3f, 2f, 3.3f, 2f, 3.65f)
                curveTo(2f, 3.69f, 2f, 3.73f, 2f, 3.77f)
                lineTo(4.73f, 20.27f)
                curveTo(4.8f, 20.69f, 5.16f, 21f, 5.58f, 21f)
                horizontalLineTo(18.63f)
                curveTo(18.94f, 21f, 19.22f, 20.78f, 19.27f, 20.46f)
                lineTo(22f, 3.77f)
                curveTo(22.05f, 3.42f, 21.81f, 3.09f, 21.46f, 3.04f)
                curveTo(21.43f, 3.03f, 21.39f, 3.03f, 21.35f, 3.03f)
                lineTo(2.65f, 3f)
                moveTo(14.1f, 14.95f)
                horizontalLineTo(9.94f)
                lineTo(8.81f, 9.07f)
                horizontalLineTo(15.11f)
                lineTo(14.1f, 14.95f)
                close()
            }
        }.build()

        return _Bitbucket!!
    }

@Suppress("ObjectPropertyName")
private var _Bitbucket: ImageVector? = null
