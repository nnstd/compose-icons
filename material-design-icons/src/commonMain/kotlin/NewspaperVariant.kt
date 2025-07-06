package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NewspaperVariant: ImageVector
    get() {
        if (_NewspaperVariant != null) {
            return _NewspaperVariant!!
        }
        _NewspaperVariant = ImageVector.Builder(
            name = "NewspaperVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 3f)
                horizontalLineTo(4f)
                curveTo(2.89f, 3f, 2f, 3.89f, 2f, 5f)
                verticalLineTo(19f)
                curveTo(2f, 20.11f, 2.89f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(21.11f, 21f, 22f, 20.11f, 22f, 19f)
                verticalLineTo(5f)
                curveTo(22f, 3.89f, 21.11f, 3f, 20f, 3f)
                moveTo(5f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                moveTo(19f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                moveTo(19f, 13f)
                horizontalLineTo(12f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                moveTo(19f, 9f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _NewspaperVariant!!
    }

@Suppress("ObjectPropertyName")
private var _NewspaperVariant: ImageVector? = null
