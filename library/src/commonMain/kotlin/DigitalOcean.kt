package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DigitalOcean: ImageVector
    get() {
        if (_DigitalOcean != null) {
            return _DigitalOcean!!
        }
        _DigitalOcean = ImageVector.Builder(
            name = "DigitalOcean",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 12f)
                horizontalLineTo(2f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                curveTo(22f, 17.5f, 17.5f, 22f, 12f, 22f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                curveTo(15.32f, 18f, 18f, 15.31f, 18f, 12f)
                curveTo(18f, 8.69f, 15.31f, 6f, 12f, 6f)
                curveTo(8.69f, 6f, 6f, 8.69f, 6f, 12f)
                moveTo(8f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                moveTo(3f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _DigitalOcean!!
    }

@Suppress("ObjectPropertyName")
private var _DigitalOcean: ImageVector? = null
