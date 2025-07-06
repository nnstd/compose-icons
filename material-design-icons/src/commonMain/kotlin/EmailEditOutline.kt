package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailEditOutline: ImageVector
    get() {
        if (_EmailEditOutline != null) {
            return _EmailEditOutline!!
        }
        _EmailEditOutline = ImageVector.Builder(
            name = "EmailEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.07f, 13.88f)
                lineTo(13f, 19.94f)
                verticalLineTo(22f)
                horizontalLineTo(15.06f)
                lineTo(21.12f, 15.93f)
                moveTo(22.7f, 13.58f)
                lineTo(21.42f, 12.3f)
                curveTo(21.32f, 12.19f, 21.18f, 12.13f, 21.04f, 12.13f)
                curveTo(20.89f, 12.14f, 20.75f, 12.19f, 20.65f, 12.3f)
                lineTo(19.65f, 13.3f)
                lineTo(21.7f, 15.3f)
                lineTo(22.7f, 14.3f)
                curveTo(22.89f, 14.1f, 22.89f, 13.78f, 22.7f, 13.58f)
                moveTo(11f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                lineTo(12f, 13f)
                lineTo(20f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                moveTo(20f, 6f)
                lineTo(12f, 11f)
                lineTo(4f, 6f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _EmailEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmailEditOutline: ImageVector? = null
