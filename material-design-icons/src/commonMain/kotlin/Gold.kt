package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Gold: ImageVector
    get() {
        if (_Gold != null) {
            return _Gold!!
        }
        _Gold = ImageVector.Builder(
            name = "Gold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 22f)
                lineTo(2.5f, 17f)
                horizontalLineTo(9.5f)
                lineTo(11f, 22f)
                horizontalLineTo(1f)
                moveTo(13f, 22f)
                lineTo(14.5f, 17f)
                horizontalLineTo(21.5f)
                lineTo(23f, 22f)
                horizontalLineTo(13f)
                moveTo(6f, 15f)
                lineTo(7.5f, 10f)
                horizontalLineTo(14.5f)
                lineTo(16f, 15f)
                horizontalLineTo(6f)
                moveTo(23f, 6.05f)
                lineTo(19.14f, 7.14f)
                lineTo(18.05f, 11f)
                lineTo(16.96f, 7.14f)
                lineTo(13.1f, 6.05f)
                lineTo(16.96f, 4.96f)
                lineTo(18.05f, 1.1f)
                lineTo(19.14f, 4.96f)
                lineTo(23f, 6.05f)
                close()
            }
        }.build()

        return _Gold!!
    }

@Suppress("ObjectPropertyName")
private var _Gold: ImageVector? = null
