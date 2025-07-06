package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountSchool: ImageVector
    get() {
        if (_AccountSchool != null) {
            return _AccountSchool!!
        }
        _AccountSchool = ImageVector.Builder(
            name = "AccountSchool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 8f)
                curveTo(16f, 10.21f, 14.21f, 12f, 12f, 12f)
                curveTo(9.79f, 12f, 8f, 10.21f, 8f, 8f)
                lineTo(8.11f, 7.06f)
                lineTo(5f, 5.5f)
                lineTo(12f, 2f)
                lineTo(19f, 5.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                lineTo(15.89f, 7.06f)
                lineTo(16f, 8f)
                moveTo(12f, 14f)
                curveTo(16.42f, 14f, 20f, 15.79f, 20f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                curveTo(4f, 15.79f, 7.58f, 14f, 12f, 14f)
                close()
            }
        }.build()

        return _AccountSchool!!
    }

@Suppress("ObjectPropertyName")
private var _AccountSchool: ImageVector? = null
