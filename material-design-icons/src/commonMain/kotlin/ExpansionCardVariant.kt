package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ExpansionCardVariant: ImageVector
    get() {
        if (_ExpansionCardVariant != null) {
            return _ExpansionCardVariant!!
        }
        _ExpansionCardVariant = ImageVector.Builder(
            name = "ExpansionCardVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 7f)
                horizontalLineTo(4.5f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(8.5f)
                horizontalLineTo(2f)
                moveTo(22f, 7f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                moveTo(10f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                moveTo(13f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                moveTo(20f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _ExpansionCardVariant!!
    }

@Suppress("ObjectPropertyName")
private var _ExpansionCardVariant: ImageVector? = null
