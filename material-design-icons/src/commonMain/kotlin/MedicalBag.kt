package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MedicalBag: ImageVector
    get() {
        if (_MedicalBag != null) {
            return _MedicalBag!!
        }
        _MedicalBag = ImageVector.Builder(
            name = "MedicalBag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 3f)
                lineTo(8f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                curveTo(3.85f, 7f, 3.12f, 8f, 3f, 9f)
                lineTo(2f, 19f)
                curveTo(1.88f, 20f, 2.54f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(21.46f, 21f, 22.12f, 20f, 22f, 19f)
                lineTo(21f, 9f)
                curveTo(20.88f, 8f, 20.06f, 7f, 19f, 7f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                lineTo(14f, 3f)
                horizontalLineTo(10f)
                moveTo(10f, 5f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                moveTo(11f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _MedicalBag!!
    }

@Suppress("ObjectPropertyName")
private var _MedicalBag: ImageVector? = null
