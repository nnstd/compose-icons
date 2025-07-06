package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pandora: ImageVector
    get() {
        if (_Pandora != null) {
            return _Pandora!!
        }
        _Pandora = ImageVector.Builder(
            name = "Pandora",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 21f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                horizontalLineTo(13.71f)
                arcTo(6.75f, 6.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.46f, 9.75f)
                curveTo(20.46f, 13.5f, 17.44f, 16.5f, 13.71f, 16.5f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _Pandora!!
    }

@Suppress("ObjectPropertyName")
private var _Pandora: ImageVector? = null
