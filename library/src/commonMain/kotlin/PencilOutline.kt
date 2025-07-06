package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PencilOutline: ImageVector
    get() {
        if (_PencilOutline != null) {
            return _PencilOutline!!
        }
        _PencilOutline = ImageVector.Builder(
            name = "PencilOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.06f, 9f)
                lineTo(15f, 9.94f)
                lineTo(5.92f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(18.08f)
                lineTo(14.06f, 9f)
                moveTo(17.66f, 3f)
                curveTo(17.41f, 3f, 17.15f, 3.1f, 16.96f, 3.29f)
                lineTo(15.13f, 5.12f)
                lineTo(18.88f, 8.87f)
                lineTo(20.71f, 7.04f)
                curveTo(21.1f, 6.65f, 21.1f, 6f, 20.71f, 5.63f)
                lineTo(18.37f, 3.29f)
                curveTo(18.17f, 3.09f, 17.92f, 3f, 17.66f, 3f)
                moveTo(14.06f, 6.19f)
                lineTo(3f, 17.25f)
                verticalLineTo(21f)
                horizontalLineTo(6.75f)
                lineTo(17.81f, 9.94f)
                lineTo(14.06f, 6.19f)
                close()
            }
        }.build()

        return _PencilOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PencilOutline: ImageVector? = null
