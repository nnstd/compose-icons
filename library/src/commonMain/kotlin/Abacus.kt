package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Abacus: ImageVector
    get() {
        if (_Abacus != null) {
            return _Abacus!!
        }
        _Abacus = ImageVector.Builder(
            name = "Abacus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                moveTo(10f, 5f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                moveTo(5f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                moveTo(10f, 13f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                moveTo(2f, 21f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                moveTo(20f, 3f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(21f)
                horizontalLineTo(22f)
                verticalLineTo(3f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _Abacus!!
    }

@Suppress("ObjectPropertyName")
private var _Abacus: ImageVector? = null
