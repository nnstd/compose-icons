package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarPlus: ImageVector
    get() {
        if (_StarPlus != null) {
            return _StarPlus!!
        }
        _StarPlus = ImageVector.Builder(
            name = "StarPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.8f, 21f)
                lineTo(7.4f, 14f)
                lineTo(2f, 9.2f)
                lineTo(9.2f, 8.6f)
                lineTo(12f, 2f)
                lineTo(14.8f, 8.6f)
                lineTo(22f, 9.2f)
                lineTo(18.8f, 12f)
                horizontalLineTo(18f)
                curveTo(14.9f, 12f, 12.4f, 14.3f, 12f, 17.3f)
                lineTo(5.8f, 21f)
                moveTo(17f, 14f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _StarPlus!!
    }

@Suppress("ObjectPropertyName")
private var _StarPlus: ImageVector? = null
