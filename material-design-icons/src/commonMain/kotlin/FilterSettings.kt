package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilterSettings: ImageVector
    get() {
        if (_FilterSettings != null) {
            return _FilterSettings!!
        }
        _FilterSettings = ImageVector.Builder(
            name = "FilterSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 22f)
                horizontalLineTo(17f)
                verticalLineTo(24f)
                horizontalLineTo(15f)
                moveTo(11f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(24f)
                horizontalLineTo(11f)
                moveTo(7f, 22f)
                horizontalLineTo(9f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                moveTo(14f, 12f)
                verticalLineTo(19.88f)
                curveTo(14.04f, 20.18f, 13.94f, 20.5f, 13.71f, 20.71f)
                curveTo(13.32f, 21.1f, 12.69f, 21.1f, 12.3f, 20.71f)
                lineTo(10.29f, 18.7f)
                curveTo(10.06f, 18.47f, 9.96f, 18.16f, 10f, 17.87f)
                verticalLineTo(12f)
                horizontalLineTo(9.97f)
                lineTo(4.21f, 4.62f)
                curveTo(3.87f, 4.19f, 3.95f, 3.56f, 4.38f, 3.22f)
                curveTo(4.57f, 3.08f, 4.78f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(19.22f, 3f, 19.43f, 3.08f, 19.62f, 3.22f)
                curveTo(20.05f, 3.56f, 20.13f, 4.19f, 19.79f, 4.62f)
                lineTo(14.03f, 12f)
                close()
            }
        }.build()

        return _FilterSettings!!
    }

@Suppress("ObjectPropertyName")
private var _FilterSettings: ImageVector? = null
