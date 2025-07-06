package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NotePlus: ImageVector
    get() {
        if (_NotePlus != null) {
            return _NotePlus!!
        }
        _NotePlus = ImageVector.Builder(
            name = "NotePlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13f)
                curveTo(19.7f, 13f, 20.37f, 13.13f, 21f, 13.35f)
                verticalLineTo(9f)
                lineTo(15f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(13.35f)
                curveTo(13.13f, 20.37f, 13f, 19.7f, 13f, 19f)
                curveTo(13f, 15.69f, 15.69f, 13f, 19f, 13f)
                moveTo(14f, 4.5f)
                lineTo(19.5f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(4.5f)
                moveTo(23f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
                close()
            }
        }.build()

        return _NotePlus!!
    }

@Suppress("ObjectPropertyName")
private var _NotePlus: ImageVector? = null
