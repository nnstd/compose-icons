package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LanguageFortran: ImageVector
    get() {
        if (_LanguageFortran != null) {
            return _LanguageFortran!!
        }
        _LanguageFortran = ImageVector.Builder(
            name = "LanguageFortran",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                curveTo(6.55f, 6f, 7f, 6.45f, 7f, 7f)
                verticalLineTo(17f)
                curveTo(7f, 17.55f, 6.55f, 18f, 6f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                curveTo(11.45f, 18f, 11f, 17.55f, 11f, 17f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                curveTo(13.55f, 13f, 14f, 13.45f, 14f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                curveTo(14f, 10.55f, 13.55f, 11f, 13f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                curveTo(17.11f, 6f, 18f, 7.34f, 18f, 9f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _LanguageFortran!!
    }

@Suppress("ObjectPropertyName")
private var _LanguageFortran: ImageVector? = null
