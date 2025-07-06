package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountTieWoman: ImageVector
    get() {
        if (_AccountTieWoman != null) {
            return _AccountTieWoman!!
        }
        _AccountTieWoman = ImageVector.Builder(
            name = "AccountTieWoman",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.94f, 3f)
                curveTo(9.75f, 3.03f, 8f, 4.81f, 8f, 7f)
                curveTo(7.94f, 8.64f, 7.81f, 10.47f, 7.03f, 11.59f)
                curveTo(9.71f, 13.22f, 12f, 13f, 12f, 13f)
                curveTo(12f, 13f, 14.29f, 13.22f, 16.97f, 11.59f)
                curveTo(16.12f, 10.22f, 15.94f, 8.54f, 16f, 7f)
                curveTo(16f, 4.79f, 14.21f, 3f, 12f, 3f)
                horizontalLineTo(11.94f)
                moveTo(8.86f, 13.32f)
                curveTo(6f, 13.93f, 4f, 15.35f, 4f, 17f)
                verticalLineTo(21f)
                horizontalLineTo(12f)
                lineTo(9f, 17f)
                horizontalLineTo(6.5f)
                moveTo(12f, 21f)
                lineTo(13.78f, 13.81f)
                curveTo(13.78f, 13.81f, 13f, 14f, 12f, 14f)
                curveTo(11f, 14f, 10.22f, 13.81f, 10.22f, 13.81f)
                moveTo(12f, 21f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                curveTo(20f, 15.35f, 18f, 13.93f, 15.14f, 13.32f)
                lineTo(17.5f, 17f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _AccountTieWoman!!
    }

@Suppress("ObjectPropertyName")
private var _AccountTieWoman: ImageVector? = null
